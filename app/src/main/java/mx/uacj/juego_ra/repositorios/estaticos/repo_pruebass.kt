package mx.uacj.juego_ra.repositorios.estaticos

import android.location.Location
import mx.uacj.juego_ra.modelos.Informacion
import mx.uacj.juego_ra.modelos.Pista

object RepositoriosPistas {

    val nivelesPistas = listOf(
        // Lista de pistas fáciles
        listOf(
            Pista(
                nombre = "Fugitivos simple vista",
                id = 0,
                nombreUbicacion = "Entrada principal",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.7427941
                    longitude = -106.4343117
                },
                cuerpo = Informacion(
                    texto = "Unos ladrones acaban de cometer un gran robo en una joyeria muy importante, robando " +
                            "cientos de miles de pesos en joyeria de oro puro y piedras preciosas. Se les perdio el rastro, " +
                            "pero una hora despues, la comisaria recibe una llamada de los guardias de un lugar muy particular. \n\n" +
                            "Los ladrones fueron vistos por ultima vez entrando en la " +
                            "universidad, los guardias confirman que no los han visto salir," +
                            " pero no parecen conocer sus ubicaciones exactas. \n\n" +
                            "Ellos solo alcanzaron a ver que corrieron a la derecha y entraron " +
                            "al primer edificio del abecedario. Al momento de tu llegada, ha pasado " +
                            "1 hora desde su ingreso",
                    imagen = null
                ),
                completada = 1
            ),
            Pista(
                nombre = "¿Estudiantes?",
                id = 1,
                nombreUbicacion = "Edificio A",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.7421526
                    longitude = -106.4335025
                },
                cuerpo = Informacion(
                    texto = "Investigando el edificio, encuentras que en los baños hay dos bolsas " +
                            "negras bajo el lavabo, conteniendo el equipamiento que llevaban los " +
                            "ladrones durante el robo, lo que significa que cambiaron de ropa y su objetivo principal era esconderse.\n" +
                            "\nTodavia falta una bolsa, la que contiene el botin, pero entre las pertenencias encuentras un caderno con " +
                            "apuntes matematicos. En la ultima hoja escrita, puedes ver que anoto varios temas de estudio para un parcial " +
                            "que coincide con la fecha de hoy. \n\n Tal vez puedas encontrar algun indicio en un lugar comunmente usado " +
                            "para el estudio.",
                    imagen = null
                ),
                completada = 1
            ),
            Pista(
                nombre = "Altercado",
                id = 2,
                nombreUbicacion = "Biblioteca",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.7429235
                    longitude = -106.433481
                },
                cuerpo = Informacion(
                    texto = "Cuando llegas a la biblioteca, un pasante se acerca a ti y te informa de " +
                            "una pelea hace media hora dentro de un cubiculo entre dos estudiantes. " +
                            "Parece que uno de ellos llevaba una mochila negra que acerta con la descripcion " +
                            "de aquella faltante donde se presume se encuentran las joyas. \n\n" +
                            "Al revisar el cubiculo, ves manchas de sangre abundantes, al igual que un libro " +
                            "de algebra. Su examen, en el momento del altercado, debio de estar apunto de empezar, " +
                            "esa podria ser su siguiente posicion. Como extra, la credencial de uno de ellos seguia con los " +
                            "encargados. Ahora cuentas con sus datos personales, resulta ser que como minimo uno de ellos es " +
                            "estudiante de DDMI.",
                    imagen = null
                ),
                completada = 1
            ),
            Pista(
                nombre = "Huida y desesperacion",
                id = 3,
                nombreUbicacion = "Edificio G",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.7433854
                    longitude = -106.4330103
                },
                cuerpo = Informacion(
                    texto = "Entre los pasillos puedes notar un pequeño rastro de gotas de sangre, " +
                            "probablemente del ladron herido. Siguiendolo terminas en un salon todavia con " +
                            "alumnos, en silencio, aparentemente en examen. " +
                            "Al acercarte a la maestra, ella te menciona que uno de sus alumnos estaba en el telefono " +
                            "mandando mensajes " +
                            "durante el examen asi que se lo invalido. El enloquecio, pero decidio irse sin causar mas problemas. \n\n" +
                            "La maestra tambien menciona que su sangrado estaba empeorando y no podia detenerlo ni ocultarlo. Muy probablemente " +
                            "busque una forma de detenerlo. ¿Donde podria encontrar vendajes?",
                    imagen = null
                ),
                completada = 1
            ),
            Pista(
                nombre = "Primeros auxilios",
                id = 4,
                nombreUbicacion = "UAMI",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.7430171
                    longitude = -106.4329674
                },
                cuerpo = Informacion(
                    texto = "Cuando entras, los encargados inmediatamente te cuentan lo que vieron, sabiendo lo que buscas. " +
                            "El estudiante entro y pidio ayuda con sus heridas. Mientras los aun estudiantes de enfermeria " +
                            "le aplicaban un vendaje, el estaba intentando hacer una llamada, pero siempre le colgaban, hasta que " +
                            "por fin respondieron. \n\n" +
                            "Lo que siguio fue una discusion intensa llena de insultos y amenazas, hasta que el estudiante se levanto y " +
                            "salio corriendo. Lo ultimo que lograron escuchar es que menciono que se verian en \"su edificio\".",
                    imagen = null
                ),
                completada = 1
            ),
            Pista(
                nombre = "Codicia",
                id = 5,
                nombreUbicacion = "Edificio V",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.742070
                    longitude = -106.432392
                },
                cuerpo = Informacion(
                    texto = "Al llegar al edificio, puedes ver a los dos estudiantes afuera peleando entre ellos. Antes de que " +
                            "vuelvan a herirse de gravedad, intervienes junto con tu compañero y los detienen finalmente, poniendole fin " +
                            "a la busqueda. \n\n" +
                            "Resulta que no podian ponerse deacuerdo en como se dividirian el botin, por lo que fueron a la biblioteca a " +
                            "tomar una decision y estudiar para el examen, pero la discusion escalo y uno de ellos escapo con el botin.\n\n" +
                            "Intento salir de la universidad pero no encontro forma, por lo que decidio volver a reunirse con su compañero " +
                            "y hacer las pases, pero era demasiado tarde.",
                    imagen = null
                ),
                completada = 0
            ),
        )
    )
}