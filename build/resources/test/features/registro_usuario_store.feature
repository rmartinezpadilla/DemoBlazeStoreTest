#language: es
  Característica: registrar usuario
    Como suaurio
    quiero registrarme
    en la pagina Store

  Antecedentes:
    Dado que requiero ingresar a la pagina demoblaze

      Escenario: registrar usuario
        Cuando se realiza el regristo en la pagina con usuario: testretoweb y contrasena: testretoweb
        Entonces se valida la creacion del usuario


