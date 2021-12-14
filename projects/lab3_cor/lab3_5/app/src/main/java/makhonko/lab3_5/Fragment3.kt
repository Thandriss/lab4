package makhonko.lab3_5


import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import makhonko.lab3_5.databinding.Fragment1Binding
import makhonko.lab3_5.databinding.Fragment3Binding


class Fragment3 : Fragment() {
    private var binding: Fragment3Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        binding = Fragment3Binding.inflate(inflater, container, false)
        return binding?.root as View
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            bnToSecond.setOnClickListener {
                findNavController().navigate(R.id.third_to_second)
            }
            bnToFirst.setOnClickListener {
                findNavController().navigate(R.id.third_to_first)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}