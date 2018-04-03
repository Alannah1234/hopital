public class Infirmier extends Element
{
    //INFIRMIER (#NUMERO, #CODE_SERVICE, ROTATION, SALAIRE)
    numero decimal (4) primary key,
    code_service char (3),
    rotation enum ('JOUR', 'NUIT') not null default 'JOUR',
    salaire decimal (6,2),
}