describe("Tickets", ()=> {
    // Indo para uma URL:
    beforeEach( () => cy.visit ("https://ticket-box.s3.eu-central-1.amazonaws.com/index.html"));
    
    //Preenchendo os campos do tipo texto:
    it ("Fill all text fields", () => {
     // Encontrando elementos e digitando:
     cy.get("#first-name").type ("Flávio");
     cy.get("#last-name").type ("Schefer");
     cy.get("#email").type ("teste@aol.com");
     cy.get("#requests").type ("Teste de request");
     cy.get("#signature").type("fschefer"); 
    });

    //"Selectando":
    it ("Selects the ticket quantity", () => {
        cy.get("#ticket-quantity").select("2");
    });

    //Interagindo com botões redondos:
it ("Clicks the VIP button"), () => {
    cy.get ("#vip").check()
};

//Clickando em checkboxes:
it ("clicks on the checkbox"),() => {
    cy.get ("#social-media").check()
};
it ("Selects two options, then unchecks one"), () => {
    cy.get ("#friend").chcek()
    cy.get ("#publication").check()
    cy.get ("#friend").unchcek()
};

//Fazendo verificações:
    it ("has 'TICKETBOX' on header's heading", () => {
        cy.get ("header h1").should("contain", "TICKETBOX")
    });
    it ("Alerts on invalid email"), () => {
        cy.get("#email").type ("teste-invalid.com");
        cy.get ("#email.invalid").should("exist");
    } 
});