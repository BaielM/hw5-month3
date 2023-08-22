package com.example.hw5_month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.hw5_month3.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private var count = 0
    private var count2 = 10

    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            if (count != 10) {
                count++
                binding.textView.text = count.toString()
            } else {
                binding.button.text = "-1"
                count2--
                binding.textView.text = count2.toString()
            }
            if (count2 == 0) {
                val secondFragment = SecondFragment()
                val bundle = Bundle()
                bundle.putInt("COUNT", count2)
                secondFragment.arguments = bundle
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.container, secondFragment).commit()
            }
        }
    }
}