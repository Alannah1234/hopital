public class Docteur extends Element
{
    DOCTEUR (#NUMERO, SPECIALITE)
    create table docteur (
        numero decimal (4) primary key,
    specialite enum ('Anesthesiste',
        'Cardiologue',
        'Generaliste',
        'Orthopediste',
        'Pneumologue',
        'Radiologue',
        'Traumatologue') default 'Generaliste' not null,
    foreign key (numero) references employe (numero) on delete cascade on update cascade ) ;
}

