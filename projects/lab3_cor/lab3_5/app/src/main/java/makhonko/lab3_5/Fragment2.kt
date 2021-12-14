package makhonko.lab3_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import makhonko.lab3_5.databinding.Fragment2Binding


class Fragment2 : Fragment() {

    private var binding: Fragment2Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        binding = Fragment2Binding.inflate(inflater, container, false)
        return binding?.root as View
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            bnToFirst.setOnClickListener {
                findNavController().navigate(R.id.second_to_first)
            }
            bnToThird.setOnClickListener {
                findNavController().navigate(R.id.second_to_third)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
