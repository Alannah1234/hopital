public class Chambre extends Element
{
    private String no_chambre;
    private

    CHAMBRE (NO_CHAMBRE, #CODE_SERVICE, SURVEILLANT, NB_LITS)
    code_service char (3),
    no_chambre decimal (3),
    primary key (code_service, no_chambre),
    surveillant decimal (4),
    nb_lits decimal (2),

}