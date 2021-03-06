package io.github.tuguzt.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import io.github.tuguzt.fragments.databinding.FragmentColoredBinding

class ColoredFragment : Fragment() {

    private var _binding: FragmentColoredBinding? = null
    private val binding get() = _binding!!

    private val sharedViewModel: ColorViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentColoredBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        sharedViewModel.color.observe(viewLifecycleOwner) { color ->
            binding.view.setBackgroundColor(color)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
