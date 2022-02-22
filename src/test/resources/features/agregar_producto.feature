#language: es

  Característica: agragar productos al carrito
    Como usuario de store
    quiero agregar productos
    al carrito de compra

    Antecedentes:
      Dado que requiero ingresar a la pagina demoblaze
    Esquema del escenario: agregar producto al carrito
      Cuando agrego <producto> de la categoria <categoria>
      Entonces puedo ver el <precio> a pagar en el carrito de compra
      Ejemplos:
        |producto         | categoria  |precio|
        |Apple monitor 24 |Monitors    |400|
       # |ASUS Full HD     |Monitors    |230|
       # |Samsung galaxy s7|Phones      |800|
       # |HTC One M9       |Phones      |700|