## ✨ proyecto_I_programacion_III✨
| Nombre |Numero de carnet |
| ------ | ------ |
| Estiven Joel Laferre 🌻| 7690-22-2644|
|🌹 Melany Romero Samayoa🌹 |7690-22-48
| Pebro Luis Alvarez Gonzalez🌼| 7690-22-5839 |
|Brandon Rodriguez Blanco🌷| 7690-22-10255 |

nuestro programa,tiene estos 3 resultados,los cuales son:
1. El árbol de forma gráfica🌲🌲🌲
   ![image](https://github.com/estiven-lg/proyecto_I_programacion_III/assets/95370813/796f04a1-fecd-4878-ac0f-958e4cfda73c)

2. Recorridos del árbol🌳
   ![image](https://github.com/estiven-lg/proyecto_I_programacion_III/assets/95370813/e9348cc9-c25b-4916-bdb3-7b62d19a977b)

2. Resultado de la operacion
   ![image](https://github.com/estiven-lg/proyecto_I_programacion_III/assets/95370813/de351890-2d2c-4af3-ad76-906e5035d162)



## 😈Errores😈
A continuación se les presentara el proyecto de programación el cual consiste en realizar una aplicación que reciba un texto, una expresión matemática limitada
en sumas, restas, multiplicaciones, divisiones, potencias y raizes:
a + b – (c – d) +  e
La aplicación debe tener la capacidad de validar los caracteres permitidos para evitar excepciones, si la
expresión ingresada contiene variables el siguiente paso es solicitar los valores de dichas variables para
el ejemplo deberá solicitar los valores para
1. a = 5
2. b = 4
3. c = 6
4. d = 7
5. e = 23

![Captura de pantalla 2024-03-15 222155](https://github.com/estiven-lg/proyecto_I_programacion_III/assets/117334084/5ff90b61-5566-4a9b-9e0b-de21ff31f7e4)

Los error   que este puede presentar son los siguientes:
![Captura de pantalla 2024-03-15 214552](https://github.com/estiven-lg/proyecto_I_programacion_III/assets/117334084/c7db736c-a761-455a-ac69-771860f1861f)

"o=p(p*g-9)"
el programa nos indica que ingresamos un caracter no operable y esto por nuestro
"if (!operation.matches("^[a-zA-Z0-9()+*\\-/^]*$"))" esto valida que dentro de la operacion solo haya numeros, letras,signos operacio=

"+9*(8+0)"
En el siguente error nos dice que las operaciones no pueden terminar ni comenzar en signos esto por "verificator = Pattern.compile("^[-+*/]|[-+*/]$").matcher(operation);"

"9*8/09p*4(i)"
Nos dice que no podemos poner variables a la par de otra variabley esto por
" verificator = Pattern.compile("(?<=[a-zA-Z0-9])[a-zA-Z]|(?<=[a-zA-Z])[a-zA-Z0-9]").matcher(operation);"

"o*{00)*01m"
Nos dice que hay un parentesis incomplet y esto por "if ((operation.length() - operation.replace("(", "").length())
                != operation.length() - operation.replace(")", "").length())"
 Las demás tienen los mismos errores.
 y asi hasta llegar a uno correcto.


