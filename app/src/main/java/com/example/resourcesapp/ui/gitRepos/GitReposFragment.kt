package com.example.resourcesapp.ui.gitRepos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.resourcesapp.R
import com.example.resourcesapp.views.listingAdapter
import com.example.resourcesapp.views.listingModel

class GitReposFragment : Fragment() {
    private var mViewModel: GitReposViewModel? = null
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gitrepos, container, false)
        rv = view.findViewById(R.id.recyclerView_gitrepos)
        listings()
        return view
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProvider(this).get(GitReposViewModel::class.java)
        // TODO: Use the ViewModel
    }

    fun listings() {
        lists = ArrayList()
        //sample here
//        lists.add(new listingModel("", "", "https://www."));
        lists!!.add(
            listingModel(
                "The Algorithms",
                "Collection of algorithms implememted in loads of different languages",
                "https://github.com/TheAlgorithms"
            )
        )
        lists!!.add(
            listingModel(
                "The Book of Secret Knowledge",
                "A collection of inspiring lists, manuals, cheatsheets, blogs, hacks, one-liners, cli/web tools and more.",
                "https://github.com/trimstray/the-book-of-secret-knowledge"
            )
        )
        lists!!.add(
            listingModel(
                "Project Based Learning",
                "Curated list of project-based tutorials",
                "https://github.com/practical-tutorials/project-based-learning"
            )
        )
        lists!!.add(
            listingModel(
                "Developer Roadmap",
                "Role & Skill based learning  roadmaps",
                "https://roadmap.sh/"
            )
        )
        lists!!.add(
            listingModel(
                "Build Your Own X",
                "This repository is a compilation of well-written, step-by-step guides for re-creating our favorite technologies from scratch.",
                "https://github.com/codecrafters-io/build-your-own-x"
            )
        )
        lists!!.add(
            listingModel(
                "Design Patterns Implemented in Java",
                "Description class diagrams implementation and resources  for major fesign patterns",
                "https://github.com/iluwatar/java-design-patterns"
            )
        )
        lists!!.add(
            listingModel(
                "RealWorld",
                """The mother of all demo apps" — Exemplary fullstack Medium.com clone powered by React, Angular, Node, Django, and many more
RealWorld allows you to choose any frontend (React, Angular, & more) and any backend (Node, Django, & more) and see how they power a real-world, beautifully designed full-stack app called Conduit.""",
                "https://github.com/gothinkster/realworld"
            )
        )
        lists!!.add(
            listingModel(
                "Design Resources for Developers",
                "Curated list of design and ui resources from stock photos , web templates, CSS frameworks, UI libraries, tools and much more",
                "https://github.com/bradtraversy/design-resources-for-developers"
            )
        )
        lists!!.add(
            listingModel(
                "Web App Fundamentals",
                "Learn the foundational concepts of building web applications",
                "https://github.com/epicweb-dev/web-app-fundamentals"
            )
        )
        lists!!.add(
            listingModel(
                "How Web Works",
                "What happens behind the scenes when we type www.google.com in a browser?",
                "https://github.com/vasanthk/how-web-works"
            )
        )
        lists!!.add(
            listingModel(
                "Web Dev for Beginners",
                "24 Lessons, 12 Weeks, Get Started as a Web Developer",
                "https://github.com/microsoft/Web-Dev-For-Beginners"
            )
        )
        lists!!.add(
            listingModel(
                "Front-End Collection",
                "Notes for Fullstack Software Engineers. Covers common data structure and algorithms, web concepts, Javascript / TypeScript, React, and more!",
                "https://github.com/cheatsheet1999/FrontEndCollection"
            )
        )
        lists!!.add(
            listingModel(
                "Javascript30",
                "30 Day Vanilla JS Challenge",
                "https://github.com/wesbos/JavaScript30"
            )
        )
        lists!!.add(
            listingModel(
                "Developer handbook",
                "An opinionated guide on how to become a professional Web/Mobile App Developer.",
                "https://github.com/apptension/developer-handbook"
            )
        )
        lists!!.add(
            listingModel(
                "SpellBook of Modern Webdev",
                "A Big Picture, Thesaurus, and Taxonomy of Modern JavaScript Web Development",
                "https://github.com/dexteryy/spellbook-of-modern-webdev"
            )
        )
        lists!!.add(
            listingModel(
                "Free Programming Books",
                "\uD83D\uDCDA Freely available programming books",
                "https://github.com/EbookFoundation/free-programming-books"
            )
        )
        lists!!.add(
            listingModel(
                "Clean Code Javascript",
                "\uD83D\uDEC1 Clean Code concepts adapted for JavaScript",
                "https://github.com/ryanmcdermott/clean-code-javascript"
            )
        )
        lists!!.add(
            listingModel(
                "System Design Primer",
                "Learn how to design large-scale systems. Prep for the system design interview. Includes Anki flashcards.",
                "https://github.com/donnemartin/system-design-primer"
            )
        )
        lists!!.add(
            listingModel(
                "Simpl",
                "An open source platform for creating amazing games and simulations.",
                "https://github.com/simplworld"
            )
        )
        lists!!.add(
            listingModel(
                "Coding Interview University",
                "A complete computer science study plan to become a software engineer.",
                "https://github.com/jwasham/coding-interview-university"
            )
        )
        lists!!.add(
            listingModel(
                "Front-End Interview Handbook",
                "⚡️ Front End interview preparation materials for busy engineers",
                "https://github.com/yangshun/front-end-interview-handbook"
            )
        )
        lists!!.add(
            listingModel(
                "Tech Interview Handbook",
                "\uD83D\uDCAF Curated coding interview preparation materials for busy software engineers",
                "https://github.com/yangshun/tech-interview-handbook"
            )
        )
        lists!!.add(
            listingModel(
                "Awesome",
                "\uD83D\uDE0E Awesome lists about all kinds of interesting topics",
                "https://github.com/sindresorhus/awesome"
            )
        )
        lists!!.add(
            listingModel(
                "Awesome-List",
                "An awesome list is a list of awesome things curated by the community. There are awesome lists about everything from CLI applications to fantasy books. The main repository serves as a curated list of awesome lists.",
                "https://github.com/topics/awesome"
            )
        )
        lists!!.add(
            listingModel(
                "The Art of Command Line",
                "Master the command line, in one page",
                "https://github.com/jlevy/the-art-of-command-line"
            )
        )
        lists!!.add(
            listingModel(
                "The art of Hacking",
                "This repository includes thousands of resources related to ethical hacking / penetration testing, digital forensics and incident response (DFIR), vulnerability research, exploit development, reverse engineering, and more.",
                "https://github.com/The-Art-of-Hacking/h4cker"
            )
        )
        lists!!.add(
            listingModel(
                "30 Seconds of Code",
                "Short code snippets for all your development needs",
                "https://github.com/30-seconds/30-seconds-of-code"
            )
        )
        lists!!.add(
            listingModel(
                "App-Ideas",
                "A Collection of application ideas which can be used to improve your coding skills.",
                "https://github.com/florinpop17/app-ideas"
            )
        )
        lists!!.add(
            listingModel(
                "Public-APIs",
                "A collective list of free APIs",
                "https://github.com/public-apis/public-apis"
            )
        )
        lists!!.add(
            listingModel(
                "Tensorflow",
                "An Open Source Machine Learning Framework for Everyone",
                "https://github.com/tensorflow/tensorflow"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): GitReposFragment {
            return GitReposFragment()
        }
    }
}