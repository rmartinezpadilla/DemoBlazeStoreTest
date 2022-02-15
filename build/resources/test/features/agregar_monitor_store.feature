#language: es

Característica: agregar monitor al carrito

  Como usuario de store
  quiero agregar telefonos
  al carrito de compra


  Antecedentes:
    Dado que requiero ingresar a la pagina demoblaze

  Esquema del escenario: agregar producto en categoria monitores
    Cuando agrego <producto> de la categoria monitores
    Entonces puedo ver el mensaje de producto agregado correctamente
    Ejemplos:
      |producto        |
      |Apple monitor 24|
      |ASUS Full HD    |