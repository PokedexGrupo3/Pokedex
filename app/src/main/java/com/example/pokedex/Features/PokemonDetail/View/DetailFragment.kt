package com.example.pokedex.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.pokedex.R
import com.example.pokedex.databinding.FragmentDetailBinding
import com.google.android.material.tabs.TabLayout


class DetailFragment : Fragment() {

    private var binding: FragmentDetailBinding? = null

    private lateinit var detailview: View
    private lateinit var detailrecylcer: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentDetailBinding.inflate(layoutInflater)

        val levelFragment = LevelFragment()
        val eggFragment = EggFragment()
        val tmFragment = TMFragment()

        val tabLayout = binding?.tbDetail
        val viewpager = binding?.vwDetail

        val fragments = listOf(levelFragment, tmFragment, eggFragment)

        val adapter = DetailAdapter(fragments)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}

class LevelFragment: Fragment(){

    private lateinit var levelView: View
    private lateinit var recyclerView: RecyclerView

    private val listLevel = arrayListOf(
        Level("Skill1",45,100,"1"),
        Level("Skill2",45,100,"1"),
        Level("Skill3",45,100,"1"),
        Level("Skill4",45,100,"1"),
        Level("Skill5",45,100,"1"),
        Level("Skill6",45,100,"1"),
        Level("Skill7",45,100,"1"),

        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        levelView = inflater.inflate(R.layout.fragment_level, container, false)
        return levelView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = levelView.findViewById(R.id.rv_Level)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = LevelAdapter(listLevel)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

    }

}

class EggFragment: Fragment() {

    private lateinit var eggView: View
    private lateinit var recyclerView: RecyclerView

    private val eggList = arrayListOf(
        Egg("Nome",45,100,"1"),
        Egg("Nome",45,100,"1"),Egg("Nome",45,100,"1"),
        Egg("Nome",45,100,"1"),
        Egg("Nome",45,100,"1"),
        Egg("Nome",45,100,"1"),Egg("Nome",45,100,"1"),
        Egg("Nome",45,100,"1"),
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        eggView = inflater.inflate(R.layout.fragment_egg, container, false)
        return eggView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = eggView.findViewById(R.id.rv_Egg)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = EggAdapter(eggList)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

    }

}

class TMFragment: Fragment() {

    private lateinit var tmView: View
    private lateinit var recyclerView: RecyclerView

    private val tmList = arrayListOf(
        Tm("Nome",45,100,"1"),
        Tm("Nome",45,100,"1"),
        Tm("Nome",45,100,"1"),
        Tm("Nome",45,100,"1"),
        Tm("Nome",45,100,"1"),
        Tm("Nome",45,100,"1"),
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        tmView = inflater.inflate(R.layout.fragment_tm, container, false)
        return tmView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = tmView.findViewById(R.id.rv_TM)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = TmAdapter(tmList)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

    }


}
