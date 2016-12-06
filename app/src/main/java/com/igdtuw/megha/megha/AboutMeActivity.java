package com.igdtuw.megha.megha;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.igdtuw.megha.megha.Activities.Project.Eventley;
import com.igdtuw.megha.megha.Activities.Project.Miscellaneous.EducationActivity;
import com.igdtuw.megha.megha.Activities.Project.Miscellaneous.PositionsofResponsibilityActivity;
import com.igdtuw.megha.megha.Activities.Project.Miscellaneous.SocialWorkActivity;
import com.igdtuw.megha.megha.Activities.Project.MoviePlate;
import com.igdtuw.megha.megha.Activities.Project.OthelloBoardGame;
import com.igdtuw.megha.megha.Activities.Project.RTIManagementSystem;
import com.igdtuw.megha.megha.Activities.Project.ScientficCalculator;
import com.igdtuw.megha.megha.Fragments.AboutMeFragment;
import com.igdtuw.megha.megha.Fragments.AchievementsFragment;
import com.igdtuw.megha.megha.Fragments.ContactDetailsFragment;
import com.igdtuw.megha.megha.Fragments.CoursesFragment;
import com.igdtuw.megha.megha.Fragments.MiscellaneousFragment;
import com.igdtuw.megha.megha.Fragments.ProjectsFragment;
import com.igdtuw.megha.megha.Fragments.TechnicalSkillsFragment;

public class AboutMeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, Constants {

    Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        AboutMeFragment aboutMeFragment = new AboutMeFragment();
        currentFragment = aboutMeFragment;
        getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, aboutMeFragment).commit();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        if(currentFragment instanceof IOnFocusListenable) {
            ((IOnFocusListenable) currentFragment).onWindowFocusChanged(hasFocus);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about_me) {
            AboutMeFragment fragment = new AboutMeFragment();
            currentFragment = fragment;
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_projects) {
            ProjectsFragment fragment = new ProjectsFragment();
            currentFragment = fragment;
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_resume) {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_VIEW);
            i.setData(Uri.parse(RESUME_URL));
            startActivity(i);
        } else if (id == R.id.nav_technical_skills) {
            TechnicalSkillsFragment fragment = new TechnicalSkillsFragment();
            currentFragment = fragment;
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_courses) {
            CoursesFragment fragment = new CoursesFragment();
            currentFragment = fragment;
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_achievements) {
            AchievementsFragment fragment = new AchievementsFragment();
            currentFragment = fragment;
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_contact_details) {
            ContactDetailsFragment fragment = new ContactDetailsFragment();
            currentFragment = fragment;
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_miscellaneous) {
            MiscellaneousFragment fragment = new MiscellaneousFragment();
            currentFragment = fragment;
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_work_experience) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void miscellaneousEducation(View v){
        Intent i = new Intent();
        i.setClass(AboutMeActivity.this, EducationActivity.class);
        startActivity(i);
    }
    public void miscellaneousSocialWork(View v){
        Intent i = new Intent();
        i.setClass(AboutMeActivity.this, SocialWorkActivity.class);
        startActivity(i);
    }
    public void miscellaneousPositionofResponsibility(View v){
        Intent i = new Intent();
        i.setClass(AboutMeActivity.this, PositionsofResponsibilityActivity.class);
        startActivity(i);
    }


    public void contactGithub(View v){
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse(GITHUB_PROFILE_URL));
        startActivity(i);
    }
    public void contactFacebook(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(FACEBOOK_PROFILE_URL));
        startActivity(i);
    }
    public void contactLinkedin(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(LINKEDIN_PROFILE_URL));
        startActivity(i);
    }
    public void contactGoogle(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(GOOGLE_PLUS_PROFILE_URL));
        startActivity(i);
    }
    public void contactTwitter(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(TWITTER_PROFILE_URL));
        startActivity(i);
    }
}