use spring;

create table trm_turma(
    trm_id bigint primary key auto_increment,
    trm_data_hora_cadastro datetime not null,
    trm_ano int not null,
    trm_semestre int not null,
    trm_tamanho int

);

insert into trm_turma (trm_data_hora_cadastro, trm_ano, trm_semestre, trm_tamanho)
    values ('2023-10-24 10:00', 2023, 1, 35),
           ('2023-10-24 11:00', 2023, 2, null);


create table voc_vocabulo (
 voc_id bigint primary key auto_increment,
 voc_termo varchar(100) not null,
 voc_significado varchar(200) not null,
 voc_versao int not null default 0,
 voc_data_hora_cadastro datetime not null,
 voc_data_hora_desativacao datetime
);

create table emp_empregado (
    emp_id bigint primary key auto_increment,
    emp_nome_completo varchar(100) not null,
    emp_ctps bigint not null,
    emp_data_hora_cadastro datetime not null,
    emp_email varchar(30) not null,
    emp_carga_horaria float
);

insert into emp_empregado (emp_nome_completo,emp_ctps,emp_data_hora_cadastro, emp_email)
values ('Charles Smith', 12345678910, current_timestamp(), 'chsmith@email.com'),
        ('Ann Doe', 23456743212, current_timestamp(), 'anndoe@email.com');

insert into voc_vocabulo (voc_termo, voc_significado, voc_versao, voc_data_hora_cadastro)
 values ('tupla', 'linha de uma tabela', 1, '2023-10-01 10:00:06'),
        ('tupla', 'conjunto de atributos relacionados', 2, current_timestamp());
