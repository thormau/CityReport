package com.example.cityreport

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cityreport.databinding.ItemIncidenciaBinding

class IncidenciaAdapter(
    private val incidencias: List<Incidencia>
) : RecyclerView.Adapter<IncidenciaAdapter.IncidenciaViewHolder>() {

    inner class IncidenciaViewHolder(val binding: ItemIncidenciaBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IncidenciaViewHolder {
        val binding = ItemIncidenciaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return IncidenciaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IncidenciaViewHolder, position: Int) {
        val item = incidencias[position]
        with(holder.binding) {
            tvTitulo.text = item.titulo
            tvUbicacion.text = item.ubicacion
            tvDescripcion.text = item.descripcion
            tvEstado.text = item.estado
        }
    }

    override fun getItemCount(): Int = incidencias.size
}