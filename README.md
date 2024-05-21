# Programación Generica

- Añadida a Java en 2004, con la version **J2SE 5.0**
- Diseñada para extender el sistema de tipado de JAVA para permitir que un tipo o
  método opere con objetos de  varios tipos.
- Asegura mayor seguridad detipado en **tiempo de compilación.**

<hr />

# ¿Porqué Usarla?

- En desarrollo de software, los **bugs** son cotidianos y debemos lidiar con ellos.
- Algunos bugs son mas fáciles de detectar que otros.
- Existen dos principales tipos de bugs y errores:
  - **Errores en tiempo de compilación:** Los mas fáciles de detectar y arreglar, ya que el software no compila. Los *mensajes de error* nos ayudan a descifrar el problema. 
  - **Errores en tiempo de Ejecución:** Los más problemáticos. no siempre salen a la superficie inmediatamente. Puede que sea o no la causal real de bugs y errores.
- **Preferimos los errores en tiempo de compilación** , y al utilizar Generics, es posible transformar muchos de esos *errores en tiempo de ejecución*, en *errores en tiempo de compilación.* Por tanto, Generics añade estabilidad al código.

<hr />

# Beneficios

- Generics habilitan a _Interfaces_ y _Clases_ en el proyecto, para ser **parámetros** de otras _clases_, _Interfaces_ o _métodos_.
- Así que es posible reusar el mismo código con diferentes entradas.
- Con las Validaciones de tipado, se nos avisa en tiempo de compilación si el código viola la seguridad en un lenguaje fuertemente tipado.
- Podemos eliminar _Casteo de tipos_ , el cual no es una buena práctica de programación, al incurrir en costos extra de procesamiento.



