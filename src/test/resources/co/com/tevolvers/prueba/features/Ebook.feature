#Language: es
#Author: Brayant Gamboa Betancur
@RegressionTest
  Feature: Registrar un usuario en ebook

    Background:
      Given El usuario ingresa los parametros


      Scenario: Realizar la creacion de un libro de manera exitosa
        When digita los datos del request
        Then realiza la creacion exitosa del libro


      Scenario:  Obtener el usuario creado
        Given El usuario ingresa a la url
        When El usuario consulta la informacion
        Then la consulta se hace exitosa

        @Prueba
      Scenario: Actualiza la informacion ingresada
        Given El usuario consulta la url
        When El usuario actualiza su informacion
        Then el servicio responde con el codigo http esperado