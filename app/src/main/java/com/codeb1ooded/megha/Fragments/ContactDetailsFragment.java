package com.codeb1ooded.megha.Fragments;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeb1ooded.megha.R;

import net.steamcrafted.materialiconlib.MaterialDrawableBuilder;

import mehdi.sakout.fancybuttons.FancyButton;

/**
 * Created by megha on 10/7/16.
 */
public class ContactDetailsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_details_fragment, container, false);

        Drawable githubDrawable = MaterialDrawableBuilder.with(getContext()) // provide a context
                .setIcon(MaterialDrawableBuilder.IconValue.GITHUB_CIRCLE) // provide an icon
                .setColor(Color.WHITE) // set the icon color
                .setToActionbarSize() // set the icon size
                .build();

        Drawable linkedinDrawable = MaterialDrawableBuilder.with(getContext())
                .setIcon(MaterialDrawableBuilder.IconValue.LINKEDIN)
                .setColor(Color.WHITE)
                .setToActionbarSize()
                .build();

        Drawable facebookDrawable = MaterialDrawableBuilder.with(getContext())
                .setIcon(MaterialDrawableBuilder.IconValue.FACEBOOK)
                .setColor(Color.WHITE)
                .setToActionbarSize()
                .build();

        Drawable googlePlusDrawable = MaterialDrawableBuilder.with(getContext())
                .setIcon(MaterialDrawableBuilder.IconValue.GOOGLE_PLUS)
                .setColor(Color.WHITE)
                .setToActionbarSize()
                .build();

        Drawable twitterDrawable = MaterialDrawableBuilder.with(getContext())
                .setIcon(MaterialDrawableBuilder.IconValue.TWITTER_CIRCLE)
                .setColor(Color.WHITE)
                .setToActionbarSize()
                .build();

        FancyButton githubButton = (FancyButton) view.findViewById(R.id.github_contact);
        githubButton.setIconResource(githubDrawable);

        FancyButton linkedinButton = (FancyButton) view.findViewById(R.id.linkedin_contact);
        linkedinButton.setIconResource(linkedinDrawable);

        FancyButton facebookButton = (FancyButton) view.findViewById(R.id.facebook_contact);
        facebookButton.setIconResource(facebookDrawable);

        FancyButton googlePlusButton = (FancyButton) view.findViewById(R.id.google_plus_contact);
        googlePlusButton.setIconResource(googlePlusDrawable);

        FancyButton twitterButton = (FancyButton) view.findViewById(R.id.twitter_contact);
        twitterButton.setIconResource(twitterDrawable);

        return view;
    }

}
