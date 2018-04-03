public class Hospitalisation extends Element
{
    HOSPITALISATION (NO_MALADE, #CODE_SERVICE, #NO_CHAMBRE, LIT)
    no_malade decimal (4) primary key,
    code_service char (3) not null,
    no_chambre decimal (3) not null,
    lit decimal (2),
}