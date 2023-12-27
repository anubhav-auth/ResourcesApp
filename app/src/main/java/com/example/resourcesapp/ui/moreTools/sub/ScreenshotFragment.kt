package com.example.resourcesapp.ui.moreTools.sub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.resourcesapp.R
import com.example.resourcesapp.views.listingAdapter
import com.example.resourcesapp.views.listingModel

class ScreenshotFragment : Fragment() {
    var lists: ArrayList<listingModel>? = null
    var rv: RecyclerView? = null
    var adapter: listingAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_screenshot, container, false)
        rv = view.findViewById(R.id.recyclerView_screenshot)
        listings()
        return view
    }

    fun listings() {
        lists = ArrayList()
        /*        sample here
        lists.add(new listingModel("", "", "https://www."));
*/lists!!.add(
            listingModel(
                "Camtasia",
                "a screen recorder that comes with a full-blown built-in editor.",
                "https://www.techsmith.com/video-editor.html"
            )
        )
        lists!!.add(
            listingModel(
                "CleanShot",
                "capture your screen in a superior way with a built-in annotation tool and Quick Access Overlay.",
                "https://getcleanshot.com/"
            )
        )
        lists!!.add(
            listingModel(
                "CloudApp",
                "record videos, webcam, annotate screenshots, create GIFs.",
                "https://www.getcloudapp.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Collabshot",
                "take and collaborate on screenshots in real-time with your coworkers.",
                "https://www.collabshot.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Gifox",
                "delightful GIF recording and sharing app.",
                "https://gifox.io/"
            )
        )
        lists!!.add(
            listingModel(
                "Giphy Capture",
                "capture parts of your screen and export as gif or mp4.",
                "https://giphy.com/apps/giphycapture"
            )
        )
        lists!!.add(
            listingModel(
                "Greenshot",
                "take a screenshot of a selected region, window or fullscreen.",
                "https://getgreenshot.org/"
            )
        )
        lists!!.add(
            listingModel(
                "Kap",
                "open source screen recorder with options to export to GIF, MP4, WebM and APNG",
                "https://getkap.co/"
            )
        )
        lists!!.add(
            listingModel(
                "Lighshot",
                "taking quick captures of your screen.",
                "https://itunes.apple.com/us/app/lightshot-screenshot/id526298438"
            )
        )
        lists!!.add(
            listingModel(
                "Monosnap",
                "create screenshots, annotate and upload them to the cloud.",
                "https://itunes.apple.com/us/app/monosnap/id540348655?mt=12"
            )
        )
        lists!!.add(
            listingModel(
                "OBS",
                "open source software for video recording and live streaming.",
                "https://obsproject.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Quicktime",
                "a video player that you can use to record your screen",
                "https://support.apple.com/quicktime"
            )
        )
        lists!!.add(
            listingModel(
                "ScreenFlow",
                "video editing and screen recording software for Mac.",
                "http://www.telestream.net/screenflow/overview.htm"
            )
        )
        lists!!.add(
            listingModel(
                "Screenie",
                "filter and search through images, change screenshot filetypes.",
                "https://www.thnkdev.com/Screenie/"
            )
        )
        lists!!.add(
            listingModel(
                "ScreenshotAPI.net",
                "create pixel-perfect full page website screenshots.",
                "https://screenshotapi.net/"
            )
        )
        lists!!.add(
            listingModel(
                "ScreenToGif",
                "record a gif of part of the screen. Only available for Windows.",
                "https://www.screentogif.com/"
            )
        )
        lists!!.add(
            listingModel(
                "ShareX",
                "screen capture, file sharing, and productivity tool.",
                "https://getsharex.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Shotty",
                "a menu bar app that helps you quickly find the screenshot you’re looking for so you can drag and drop it into any application.",
                "https://meetshotty.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Snagit",
                "capture images and video, create GIFs, annotate, edit, and share.",
                "https://www.techsmith.com/screen-capture.html"
            )
        )
        lists!!.add(
            listingModel(
                "Snipping Tool",
                "Windows free screenshot tool.",
                "https://support.microsoft.com/en-us/help/13776/windows-use-snipping-tool-to-capture-screenshots"
            )
        )
        lists!!.add(
            listingModel(
                "Snappy",
                "takes quick shots and organizes them for you into collections.",
                "http://snappy-app.com/"
            )
        )
        lists!!.add(
            listingModel(
                "Teampaper Snap",
                "allows you to take screenshots of a selected area.",
                "https://teampaper.me/snap/"
            )
        )
        adapter = listingAdapter(requireContext(), lists!!)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        rv!!.adapter = adapter
    }

    companion object {
        fun newInstance(): ScreenshotFragment {
            return ScreenshotFragment()
        }
    }
}