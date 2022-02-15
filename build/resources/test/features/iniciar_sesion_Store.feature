#language: es

Característica: iniciar sesion en store
  Como usuario
  quiero iniciar sesion
  en la pagina Store

  Antecedentes:
    Dado que requiero ingresar a la pagina demoblaze


  Escenario: ingresar usuario
    Cuando se ingresa el usuario: ruben de jesus y contrasena: ruben123
    Entonces se valida la bienvenida al usuario: ruben de jesus