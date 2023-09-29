package devandroid.felipe.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import devandroid.felipe.navigation.databinding.FragmentResumeBinding

class ResumeFragment : Fragment(){

    private var _binding: FragmentResumeBinding? = null
    private val binding get() = _binding!!
    private val args by navArgs<ResumeFragmentArgs>()
    private val textPerson by lazy { binding.textPerson }
    private val textAddress by lazy { binding.textAddress }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResumeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textPerson.text = args.model.person
        textAddress.text = args.model.address
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}