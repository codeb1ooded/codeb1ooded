package com.igdtuw.megha.megha;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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

import java.net.MalformedURLException;

public class AboutMeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

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
        getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, aboutMeFragment).commit();
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
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_projects) {
            ProjectsFragment fragment = new ProjectsFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_resume) {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://megha-code.github.io/resume_pdf.pdf"));
            startActivity(i);
        } else if (id == R.id.nav_technical_skills) {
            TechnicalSkillsFragment fragment = new TechnicalSkillsFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_courses) {
            CoursesFragment fragment = new CoursesFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_achievements) {
            AchievementsFragment fragment = new AchievementsFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_contact_details) {
            ContactDetailsFragment fragment = new ContactDetailsFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        } else if (id == R.id.nav_miscellaneous) {
            MiscellaneousFragment fragment = new MiscellaneousFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.coordinatorLayoutMainActivity, fragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void projectRTI(View v){
        Intent i = new Intent();
        i.setClass(AboutMeActivity.this, RTIManagementSystem.class);
        startActivity(i);
    }
    public void projectMovieplate(View v){
        Intent i = new Intent();
        i.setClass(AboutMeActivity.this, MoviePlate.class);
        startActivity(i);
    }
    public void projectOthello(View v){
        Intent i = new Intent();
        i.setClass(AboutMeActivity.this, OthelloBoardGame.class);
        startActivity(i);
    }
    public void projectEvently(View v){
        Intent i = new Intent();
        i.setClass(AboutMeActivity.this, Eventley.class);
        startActivity(i);
    }
    public void projectCalculator(View v){
        Intent i = new Intent();
        i.setClass(AboutMeActivity.this, ScientficCalculator.class);
        startActivity(i);
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
        String url = "https://github.com/megha-code";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void contactFacebook(View v){
        String url = "https://www.facebook.com/meghaaggarwal.yv";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void contactLinkedin(View v){
        String url = "https://www.linkedin.com/in/megha-aggarwal-772440104";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void contactGoogle(View v){
        String url = "https://plus.google.com/+MeghaAggarwalMe";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void contactTwitter(View v){
        String url = "https://twitter.com/Megha__Aggarwal";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}