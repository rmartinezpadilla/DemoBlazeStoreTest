#language: es

Característica: agregar telefono al carrito

  Como usuario de store
  quiero agregar telefonos
  al carrito de compra

  Antecedentes:
    Dado que requiero ingresar a la pagina demoblaze

  Esquema del escenario: agregar producto en categoria telefonos
    Cuando agrego <producto> de la categoria telefonos
    Entonces puedo ver el mensaje de agregado correctamente
    Ejemplos:
      |producto         |
      |Samsung galaxy s7|
      |HTC One M9       |
