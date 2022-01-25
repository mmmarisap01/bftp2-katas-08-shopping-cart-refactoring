# Shopping Cart Refactoring Kata

Os acaban de contratar para continuar el desarrollo de la aplicación de caja de Legacy Games. La desarrolladora anterior se
ha ido a las Bahamas y os ha dejado a cargo de su _legacy code_.



### Funcionalidades que nos piden: 

- Mostrar los descuentos existentes en la lista de productos y en el ticket de compra. Por ejemplo, si un juego tiene descuento, debe visualizarse como:
  ```
    (1) Mario Kart 64 - 12.30 - [25% OFF]
  ```
- Añadir cualquier descuento a los juegos, no sólo del 25%
- 2x1: algunos juegos tienen una oferta 2x1, si compras dos, sólo pagas uno
- Al comprar un juego **violento**, debe incluirse una línea de texto en el recibo de compra. Únicamente se debe mostrar
  este texto una vez, aunque se compren varios juegos considerados violentos.
  ``` 
     Algunos de estos juegos pueden incluir contenido violento para mayores de 18 años. Legacy Games no se hace
        cargo de su uso y disfrute por parte de personas pequeñas. 
  ```