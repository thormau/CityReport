package com.example.cityreport

data class Incidencia(
    val id: Int,
    val titulo: String,
    val descripcion: String,
    val ubicacion: String,
    val estado: String // Ej. "Pendiente", "En atención", "Resuelta"
)