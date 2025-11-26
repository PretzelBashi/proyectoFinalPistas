package mx.uacj.juego_ra.repositorios.estaticos

import android.location.Location
import mx.uacj.juego_ra.modelos.Informacion
import mx.uacj.juego_ra.modelos.Pista

object RepositoriosPistas {

    val nivelesPistas = listOf(
        // Lista de pistas fáciles
        listOf(
            Pista(
                nombre = "pista_1",
                id = 0,
                nombreUbicacion = "Edificio x",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.7156044
                    longitude = -106.4246012
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 1",
                    imagen = null
                ),
                completada = 1
            ),
            Pista(
                nombre = "pista_2",
                id = 1,
                nombreUbicacion = "Edificio y",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.742051557303974
                    longitude = -106.43239449750396
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 2",
                    imagen = null
                ),
                completada = 0
            ),
            Pista(
                nombre = "pista_3",
                id = 2,
                nombreUbicacion = "Edificio Z",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.742051557303974
                    longitude = -106.43239449750396
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 3",
                    imagen = null
                ),
                completada = 0
            ),
        ),
        // Lista de pistas normales
        listOf(
            Pista(
                nombre = "pista_1",
                id = 0,
                nombreUbicacion = "Edificio x",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.7156044
                    longitude = -106.4246012
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 1",
                    imagen = null
                ),
                completada = 1
            ),
            Pista(
                nombre = "pista_2",
                id = 1,
                nombreUbicacion = "Edificio y",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.742051557303974
                    longitude = -106.43239449750396
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 2",
                    imagen = null
                ),
                completada = 0
            ),
            Pista(
                nombre = "pista_3",
                id = 2,
                nombreUbicacion = "Edificio Z",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.743284485783107
                    longitude = -106.43353257877321
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 3",
                    imagen = null
                ),
                completada = 0
            ),
            Pista(
                nombre = "pista_4",
                id = 3,
                nombreUbicacion = "Edificio Z",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.743284485783107
                    longitude = -106.43353257877321
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 4",
                    imagen = null
                ),
                completada = 0
            ),
        ),
        // Lista de pistas difíciles
        listOf(
            Pista(
                nombre = "pista_1",
                id = 0,
                nombreUbicacion = "Edificio x",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.7156044
                    longitude = -106.4246012
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 1",
                    imagen = null
                ),
                completada = 1
            ),
            Pista(
                nombre = "pista_2",
                id = 1,
                nombreUbicacion = "Edificio y",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.742051557303974
                    longitude = -106.43239449750396
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 2",
                    imagen = null
                ),
                completada = 0
            ),
            Pista(
                nombre = "pista_3",
                id = 2,
                nombreUbicacion = "Edificio Z",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.742051557303974
                    longitude = -106.43239449750396
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 3",
                    imagen = null
                ),
                completada = 0
            ),
            Pista(
                nombre = "pista_4",
                id = 3,
                nombreUbicacion = "Edificio Z",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.743284485783107
                    longitude = -106.43353257877321
                },
                cuerpo = Informacion(
                    texto = "Prueba de texto para comprobar esto pista 4",
                    imagen = null
                ),
                completada = 0
            ),
            Pista(
                nombre = "pista_5",
                id = 4,
                nombreUbicacion = "Edificio Z",
                ubicacion = Location("proveedor").apply {
                    latitude = 31.743284485783107
                    longitude = -106.43353257877321
                },
                cuerpo = Informacion(
                    texto = "Encontraste el tesoro",
                    imagen = null
                ),
                completada = 0
            ),
        )
    )
}