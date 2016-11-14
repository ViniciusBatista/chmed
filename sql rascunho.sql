select * from pguia where paciente = 534 --paciente = 534 atendimento = 81
select * from pguiasaida where paciente = 534

insert into pguiasaida (paciente, atendimento, dthrliberado, medicoliberacao, usuario_codigo) values
(534, 25, '2009-10-01', 837, 380)

--update pguiasaida set medicoliberacao = 113 where paciente = 534 and atendimento = 05;

--update pguia set tiposaidatiss = 18 where paciente = 534 and atendimento = 83; 