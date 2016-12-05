package com.igdtuw.megha.megha.Fragments;

import android.graphics.Path;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.support.v4.app.Fragment;

import com.igdtuw.megha.megha.IOnFocusListenable;
import com.nightonke.wowoviewpager.Color.ColorChangeType;
import com.nightonke.wowoviewpager.Eases.EaseType;
import com.nightonke.wowoviewpager.ViewAnimation;
import com.nightonke.wowoviewpager.WoWoBackgroundColorAnimation;
import com.nightonke.wowoviewpager.WoWoPathAnimation;
import com.nightonke.wowoviewpager.WoWoPathView;
import com.nightonke.wowoviewpager.WoWoRotationAnimation;
import com.nightonke.wowoviewpager.WoWoScaleAnimation;
import com.nightonke.wowoviewpager.WoWoShapeColorAnimation;
import com.nightonke.wowoviewpager.WoWoTextViewSizeAnimation;
import com.nightonke.wowoviewpager.WoWoTranslationAnimation;
import com.nightonke.wowoviewpager.WoWoUtil;
import com.nightonke.wowoviewpager.WoWoViewPager;
import com.nightonke.wowoviewpager.WoWoViewPagerAdapter;

import com.igdtuw.megha.megha.R;
/**
 * Created by megha on 04/12/16.
 */

public class AboutMeFragment extends Fragment implements IOnFocusListenable {

    private WoWoViewPager wowo;
    private WoWoViewPagerAdapter adapter;
    View view;

    private int screenW = 1;
    private int screenH = 1;
    private int circleR = 1;

    @Override
    public void onStart() {
        super.onStart();
        wowo = (WoWoViewPager) view.findViewById(R.id.wowo_viewpager);
        adapter = new WoWoViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.setFragmentsNumber(3);
        adapter.setColorRes(android.R.color.transparent);
        wowo.setAdapter(adapter);
        onWindowFocusChanged(false);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.about_me_fragment, container, false);
        return view;
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        screenW = WoWoUtil.getScreenWidth(getActivity());
        screenH = WoWoUtil.getScreenHeight(getActivity());
        screenH = screenH - screenH/11;
        circleR = (int)Math.sqrt(screenW * screenW + screenH * screenH) + 10;

        RelativeLayout base = (RelativeLayout) view.findViewById(R.id.base);
        ViewGroup.LayoutParams layoutParams = base.getLayoutParams();
        layoutParams.height = circleR * 2;
        layoutParams.width = circleR * 2;
        base.setLayoutParams(layoutParams);

        RelativeLayout subBase = (RelativeLayout) view.findViewById(R.id.sub_base);
        layoutParams = subBase.getLayoutParams();
        layoutParams.height = screenH;
        layoutParams.width = screenW;
        subBase.setLayoutParams(layoutParams);

        setBase();
        setLogo();
        setName();
        setCV();
        setForAndroidDeveloper();
        setUniversityIcon();
        setUniversityText();
        setMailIcon();
        setMailText();

        setProjects();
        setRTIManagementSystem();
        setMovieplate();
        setOthello();
        setEventley();
        setScientificCalculator();

        setCircle();
        setPath();
        setBlogAndGithub();
    }

    private void setBase() {
        ViewAnimation animation = new ViewAnimation (view.findViewById(R.id.base));
        animation.addPageAnimaition(new WoWoBackgroundColorAnimation(
                0, 0, 1,
                ContextCompat.getColor(getActivity(), R.color.colorDarkest),
                ContextCompat.getColor(getActivity(), R.color.colorNormal),
                ColorChangeType.RGB,
                EaseType.Linear,
                true
        ));
        wowo.addAnimation(animation);
    }

    private void setLogo() {
        ViewAnimation animation = new ViewAnimation (view.findViewById(R.id.cv_logo));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                view.findViewById(R.id.cv_logo).getTranslationX(),
                view.findViewById(R.id.cv_logo).getTranslationY(),
                -screenW / 2 + 150,
                -screenH / 2 + 200,
                EaseType.EaseOutBack,
                false
        ));
        animation.addPageAnimaition(new WoWoScaleAnimation(
                0, 0, 1,
                0.5f,
                0.5f,
                EaseType.EaseOutBack,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setName() {
        ViewAnimation animation = new ViewAnimation (view.findViewById(R.id.name));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                view.findViewById(R.id.name).getTranslationX(),
                view.findViewById(R.id.name).getTranslationY(),
                - screenW / 2 + 150 + WoWoUtil.dp2px(105, getActivity()) + 20,
                - screenH / 2 + 200 - WoWoUtil.dp2px(70, getActivity()),
                EaseType.EaseOutBack,
                false
        ));
        animation.addPageAnimaition(new WoWoTextViewSizeAnimation(
                0, 0, 1,
                30f,
                22f,
                EaseType.Linear,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setCV() {
        ViewAnimation animation = new ViewAnimation (view.findViewById(R.id.cv));
        animation.addPageAnimaition(new WoWoRotationAnimation(
                0, 0, 0,
                -20,
                view.findViewById(R.id.cv).getPivotY(),
                0,
                0,
                -15,
                EaseType.EaseInBack,
                false
        ));
        animation.addPageAnimaition(new WoWoRotationAnimation(
                0, 0, 1,
                -20,
                view.findViewById(R.id.cv).getPivotY(),
                0,
                0,
                -150,
                EaseType.EaseInBack,
                false
        ));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                view.findViewById(R.id.cv).getTranslationX(),
                view.findViewById(R.id.cv).getTranslationY(),
                -screenW / 3,
                view.findViewById(R.id.cv).getTranslationY(),
                EaseType.EaseInBack,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setForAndroidDeveloper() {
        ViewAnimation animation = new ViewAnimation (view.findViewById(R.id.for_android_developer));
        animation.addPageAnimaition(new WoWoRotationAnimation(
                0, 0, 0,
                screenW + 80,
                view.findViewById(R.id.for_android_developer).getPivotY(),
                0,
                0,
                10,
                EaseType.EaseInBack,
                false
        ));
        animation.addPageAnimaition(new WoWoRotationAnimation(
                0, 0, 1,
                screenW + 80,
                view.findViewById(R.id.for_android_developer).getPivotY(),
                0,
                0,
                150,
                EaseType.EaseInBack,
                false
        ));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                view.findViewById(R.id.for_android_developer).getTranslationX(),
                view.findViewById(R.id.for_android_developer).getTranslationY(),
                -screenW / 3,
                view.findViewById(R.id.for_android_developer).getTranslationY(),
                EaseType.EaseInBack,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setUniversityIcon() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.university_icon));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                view.findViewById(R.id.university_icon).getTranslationX(),
                view.findViewById(R.id.university_icon).getTranslationY(),
                - screenW,
                0,
                EaseType.EaseInCubic,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setUniversityText() {
        ViewAnimation animation = new ViewAnimation (view.findViewById(R.id.university_text));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                view.findViewById(R.id.university_text).getTranslationX(),
                view.findViewById(R.id.university_text).getTranslationY(),
                screenW,
                0,
                EaseType.EaseInCubic,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setMailIcon() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.mail_icon));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                view.findViewById(R.id.mail_icon).getTranslationX(),
                view.findViewById(R.id.mail_icon).getTranslationY(),
                - screenW,
                0,
                EaseType.EaseInCubic,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setMailText() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.mail_text));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                view.findViewById(R.id.mail_text).getTranslationX(),
                view.findViewById(R.id.mail_text).getTranslationY(),
                screenW,
                0,
                EaseType.EaseInCubic,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setProjects() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.projects));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                screenW,
                view.findViewById(R.id.projects).getTranslationY(),
                -screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                1, 0, 1,
                0,
                view.findViewById(R.id.projects).getTranslationY(),
                -screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setRTIManagementSystem() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.rti_home_screen));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1f,
                screenW,
                view.findViewById(R.id.rti_home_screen).getTranslationY(),
                -screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                1, 0, 1,
                0,
                view.findViewById(R.id.rti_home_screen).getTranslationY(),
                screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setMovieplate() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.movieplate_home_screen));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0.2f, 1,
                screenW,
                view.findViewById(R.id.movieplate_home_screen).getTranslationY(),
                -screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                1, 0, 1,
                0,
                view.findViewById(R.id.movieplate_home_screen).getTranslationY(),
                -screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setOthello() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.othello_home_screen));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1f,
                screenW,
                view.findViewById(R.id.othello_home_screen).getTranslationY(),
                -screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                1, 0, 1,
                0,
                view.findViewById(R.id.othello_home_screen).getTranslationY(),
                screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setEventley() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.eventley_home_screen));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0.2f, 1,
                screenW,
                view.findViewById(R.id.eventley_home_screen).getTranslationY(),
                -screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                1, 0, 1,
                0,
                view.findViewById(R.id.eventley_home_screen).getTranslationY(),
                -screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setScientificCalculator() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.scientific_calculator_home_screen));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1f,
                screenW,
                view.findViewById(R.id.scientific_calculator_home_screen).getTranslationY(),
                -screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                1, 0, 1,
                0,
                view.findViewById(R.id.scientific_calculator_home_screen).getTranslationY(),
                screenW,
                0,
                EaseType.EaseOutBack,
                false
        ));
        wowo.addAnimation(animation);
    }

    private void setCircle() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.circle));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                view.findViewById(R.id.cv_logo).getTranslationX(),
                view.findViewById(R.id.cv_logo).getTranslationY(),
                -screenW / 2 + 150,
                -screenH / 2 + 200,
                EaseType.EaseOutBack,
                false
        ));
        animation.addPageAnimaition(new WoWoShapeColorAnimation(
                1, 0, 1,
                ContextCompat.getColor(getActivity(), R.color.colorNormal),
                ContextCompat.getColor(getActivity(), R.color.colorDarkest),
                ColorChangeType.RGB,
                EaseType.Linear,
                true
        ));

        try {
            animation.addPageAnimaition(new WoWoScaleAnimation(
                    1, 0, 1,
                    circleR * 2 / view.findViewById(R.id.circle).getWidth(),
                    circleR * 2 / view.findViewById(R.id.circle).getHeight(),
                    EaseType.EaseInBack,
                    false
            ));
        }
        catch (ArithmeticException e){

        }
        wowo.addAnimation(animation);
    }

    private void setPath() {
        WoWoPathView pathView = (WoWoPathView) view.findViewById(R.id.pathview);
        ViewGroup.LayoutParams layoutParams = pathView.getLayoutParams();
        layoutParams.height = screenH;
        layoutParams.width = screenW;
        pathView.setLayoutParams(layoutParams);

        int xoff = 0;
        int yoff = screenH - 576 - 100;
        float xScale = 1f;
        float yScale = 1;

        Path path = new Path();
        path.moveTo(xScale * (screenW + xoff + 50), 167 + yoff);
        path.cubicTo(
                xScale * (654 + xoff), yScale * (492 + yoff),
                xScale * (336 + xoff), yScale * (583 + yoff),
                xScale * (-150 + xoff), yScale * (576 + yoff));

        pathView.setPath(path);
        ViewAnimation animation = new ViewAnimation(pathView);
        animation.addPageAnimaition(new WoWoPathAnimation(
                1, 0f, 1f,
                EaseType.Linear,
                true));
        wowo.addAnimation(animation);
    }

    private void setBlogAndGithub() {
        ViewAnimation animation = new ViewAnimation(view.findViewById(R.id.blog_and_github));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                0, 0, 1,
                view.findViewById(R.id.blog_and_github).getTranslationX(),
                screenH,
                0,
                0,
                EaseType.EaseOutBack,
                false
        ));
        animation.addPageAnimaition(new WoWoTranslationAnimation(
                1, 0, 1,
                view.findViewById(R.id.blog_and_github).getTranslationX(),
                screenH,
                0,
                -screenH,
                EaseType.EaseOutBack,
                false
        ));
        wowo.addAnimation(animation);
    }

}
