package com.example.cityreport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cityreport.databinding.FragmentListaIncidenciasBinding

class ListaIncidenciasFragment : Fragment() {

    private var _binding: FragmentListaIncidenciasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListaIncidenciasBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Lista de datos de prueba creada con la data class Incidencia
        val listaIncidencias = listOf(
            Incidencia(1, "Fuga de agua potable", "Tubo roto en banqueta principal", "Av. Central #45", "Pendiente"),
            Incidencia(2, "Bache pronunciado", "Bache profundo en carril derecho", "Calle 12 y Av. México", "En atención"),
            Incidencia(3, "Lámpara fundida", "Alumbrado público sin operar de noche", "Calle Zaragoza #210", "Resuelta"),
            Incidencia(4, "Semáforo descompuesto", "Semáforo intermitente sin cambio de luz", "Crucero Eje 4", "Pendiente")
        )

        binding.rvIncidencias.layoutManager = LinearLayoutManager(requireContext())
        binding.rvIncidencias.adapter = IncidenciaAdapter(listaIncidencias)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}