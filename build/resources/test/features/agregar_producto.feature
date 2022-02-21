#language: es

  Característica: agragar productos al carrito
    Como usuario de store
    quiero agregar productos
    al carrito de compra

    Antecedentes:
      Dado que requiero ingresar a la pagina demoblaze
    Esquema del escenario: agregar producto al carrito
      Cuando agrego <producto> de la categoria <categoria>
      Entonces puedo ver el total a pagar en el carrito de compra
      Ejemplos:
        |producto         | categoria  |
        |Apple monitor 24 |Monitors    |
        #|ASUS Full HD     |Monitors    |
        #|Samsung galaxy s7|Phones      |
        #|HTC One M9       |Phones      |