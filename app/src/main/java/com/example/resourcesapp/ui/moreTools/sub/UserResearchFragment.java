package com.example.resourcesapp.ui.moreTools.sub;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resourcesapp.R;
import com.example.resourcesapp.views.listingAdapter;
import com.example.resourcesapp.views.listingModel;

import java.util.ArrayList;

public class UserResearchFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static UserResearchFragment newInstance() {
        return new UserResearchFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_research, container, false);
        rv = view.findViewById(R.id.recyclerView_user_research);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", ""));
*/

        lists.add(new listingModel("Appoint.ly", "a web-based scheduling tool that helps to schedule meetings quickly through the integration with calendars online.", "https://appoint.ly/"));

        lists.add(new listingModel("Calendly", "Calendly helps you schedule meetings without the back-and-forth emails.", "https://calendly.com/"));

        lists.add(new listingModel("Crowd Signal", "collect, organize and analyze data from a variety of sources, including social media and mobile.", "https://crowdsignal.com/"));

        lists.add(new listingModel("Doodle", "online calendar tool for time management, and coordinating events, meetings, appointments", "https://doodle.com/"));

        lists.add(new listingModel("Evolt", "online calendar tool for time management, and coordinating events, meetings, appointments", "https://evolt.io/en/"));

        lists.add(new listingModel("Feedback Lite", "collect high quality customer feedback using Voice of Customer solutions designed to improve your website performance and boost customer engagement.", "https://www.feedbacklite.com/"));

        lists.add(new listingModel("GoToMeeting", "a simple, extraordinarily powerful web conferencing service.", "https://www.gotomeeting.com/en-gb"));

        lists.add(new listingModel("Handrail", "end-to-end, collaborative user research and insights platform — plan research, collect and analyze data, and share your findings.", "https://handrailux.com/"));

        lists.add(new listingModel("JotForm", "create online forms, get an email for each response, collect data.", "https://www.jotform.com/"));

        lists.add(new listingModel("Lookback", "remotely run, record, and take notes for your user research sessions, either with a live product or with a prototype.", "https://lookback.io/"));

        lists.add(new listingModel("MineTime", "a free calendar app with smart scheduling and time analytics features.", "https://minetime.ai/"));

        lists.add(new listingModel("Reflector", "Reflector is a basic screen-mirroring and recording tool so you can conduct user tests remotely, using any existing wireframes or prototypes.", "https://www.airsquirrels.com/reflector"));

        lists.add(new listingModel("Reframer", "a research tool that helps your team to capture, tag (code) and identify patterns in qualitative data across multiple research participants.", "https://www.optimalworkshop.com/reframer"));

        lists.add(new listingModel("Sticktail", "a platform for centralizing, finding and sharing user insights within your organization.", "https://sticktailapp.com/"));

        lists.add(new listingModel("Survey Monkey", "online survey tool to capture the voices and opinions of the people who matter most to you.", "https://www.surveymonkey.com/"));

        lists.add(new listingModel("Typeform", "use a simple drag-and-drop interface to create any kind of form, survey, or questionnaire, and even take credit card payments.", "https://www.typeform.com/"));

        lists.add(new listingModel("Wufoo", "сreate forms, collect data and payments and automate your workflows.", "https://www.wufoo.com/"));

        lists.add(new listingModel("YesInsights", "simple one question and NPS surveys to improve your business.", "https://www.yesinsights.com/"));

        lists.add(new listingModel("UserBit", "a platform of real-time research tools for your team. Tag/code interviews and feedback, capture insights, create personas, visual sitemaps and more.", "https://userbitapp.com/"));

        lists.add(new listingModel("User Interviews", "recruit participants from a community of 125,000 members based on profession, demographics, geography and more, for any kind of research.", "https://www.userinterviews.com/"));

        lists.add(new listingModel("Zoom", "it’s one of the best online meeting services.", "https://zoom.us/"));

        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }


}