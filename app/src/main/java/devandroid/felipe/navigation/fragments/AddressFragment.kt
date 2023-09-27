package devandroid.felipe.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import devandroid.felipe.navigation.databinding.FragmentAddressBinding
import devandroid.felipe.navigation.model.PersonModel

class AddressFragment : Fragment(){

    private var _binding: FragmentAddressBinding? = null
    private val binding get() = _binding!!

    private val textStreet by lazy { binding.textEditStreet.text.toString() }
    private val textNumber by lazy { binding.textEditNumber.text.toString().toInt() }
    private val btnNext by lazy { binding.btnNext }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnNext.setOnClickListener {
            PersonModel(
                street = textStreet,
                number = textNumber
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}