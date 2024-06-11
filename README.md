Projeto de API de Cadastro de Pacientes e Medicamentos
Descrição
Este projeto é uma API desenvolvida em Java usando Spring Boot, que gerencia o cadastro de pacientes e os medicamentos que cada paciente deve tomar, incluindo horários, quantidade e dosagem. A API permite realizar operações CRUD (Create, Read, Update, Delete) para pacientes e medicamentos.

Funcionalidades
Cadastro de pacientes
Cadastro de medicamentos
Associação de medicamentos a pacientes com informações de horários, quantidade e dosagem
Operações CRUD para pacientes e medicamentos
Validação de dados de entrada
Tecnologias Utilizadas
Java 11
Spring Boot 2.6.x
Spring Data JPA
Hibernate
H2 Database (para desenvolvimento e testes)
Spring Web
Spring Validation
Lombok
Maven
Pré-requisitos
JDK 11 ou superior
Maven 3.6.x ou superior
Configuração do Ambiente
Clone o repositório:

sh
Copiar código
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
Compile o projeto:

sh
Copiar código
mvn clean install
Execute a aplicação:

sh
Copiar código
mvn spring-boot:run
