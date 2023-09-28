package devandroid.felipe.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import devandroid.felipe.navigation.R
import devandroid.felipe.navigation.model.PersonModel
import devandroid.felipe.navigation.databinding.FragmentPersonalDataBinding

class PersonalDataFragment : Fragment() {

    private var _binding: FragmentPersonalDataBinding? = null
    private val binding get() = _binding!!

    private val textName by lazy { binding.textEditName.text.toString() }
    private val textAge by lazy { binding.textEditAge.text.toString().toInt() }
    private val btnNext by lazy { binding.btnNext }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalDataBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnNext.setOnClickListener {
            val model = PersonModel(textName, textAge)
            val directions = PersonalDataFragmentDirections.goToAddressFragment(model)
            findNavController().navigate(directions)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}