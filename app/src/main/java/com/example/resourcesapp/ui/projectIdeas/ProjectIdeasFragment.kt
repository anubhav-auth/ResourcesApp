package com.example.resourcesapp.ui.projectIdeas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.resourcesapp.R

class ProjectIdeasFragment : Fragment() {
    private var mViewModel: ProjectIdeasViewModel? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_project_ideas, container, false)
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProvider(this).get(ProjectIdeasViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance(): ProjectIdeasFragment {
            return ProjectIdeasFragment()
        }
    }
}