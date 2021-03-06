package edu.bluejack151.Shine.shine;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by Marchelino on 03/01/2016.
 */
public class UserVoteFragment extends Fragment {

    private ImageView mImageViewGender, mImageViewUserPhoto;
    private TextView mTextViewUsername, mTextViewSchool;
    private Button mButtonOne, mButtonTwo, mButtonThree, mButtonFour, mButtonFive, mButtonSix;
    private Button mButtonSeven, mButtonEight, mButtonNine, mButtonTen;
    private ArrayList<ShineUser> mShineUsers;
    int curr_position = 0;
    int width = 0, height = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_user_vote, container, false);

        initializeRateButtons(v);

        mImageViewGender = (ImageView)v.findViewById(R.id.ivUserGender);
        mImageViewUserPhoto = (ImageView)v.findViewById(R.id.ivUserPhoto);
        mImageViewUserPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buka profilenya di sini
                Log.d("on pic click", mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_EMAIL));
                ((HomeActivity)getActivity()).onProfilePictureClicked(mShineUsers.get(0).getUser());

            }
        });
        mTextViewUsername = (TextView)v.findViewById(R.id.tvUserVoteName);
        mTextViewSchool = (TextView)v.findViewById(R.id.tvUserSchool);

        mShineUsers = ((HomeActivity)getActivity()).getShineUsers();
        height = ((ImageView)v.findViewById(R.id.ivUserPhoto)).getHeight();
        width = ((ImageView)v.findViewById(R.id.ivUserPhoto)).getWidth();

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "font/myfont.ttf");
        mTextViewUsername.setTypeface(tf);
        if(mShineUsers.size() != 0)
        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
        return v;
    }

    private void initializeRateButtons(View v)
    {
        mButtonOne = (Button)v.findViewById(R.id.btn1);
        mButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mShineUsers.size()!= 0) {
                    String id = mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_ID);
                    ((HomeActivity) getActivity()).voteRequest(id, "1");
                    mShineUsers.remove(0);
                    if(mShineUsers.size()!=0)
                        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
                    else
                        emptyState();
                }
                else
                    Toast.makeText(getActivity(), "No user", Toast.LENGTH_SHORT).show();
            }
        });
        mButtonTwo = (Button)v.findViewById(R.id.btn2);
        mButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mShineUsers.size()!= 0) {
                    String id = mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_ID);
                    ((HomeActivity) getActivity()).voteRequest(id, "2");
                    mShineUsers.remove(0);
                    if(mShineUsers.size()!=0)
                        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
                    else
                        emptyState();
                }
                else
                    Toast.makeText(getActivity(), "No user", Toast.LENGTH_SHORT).show();

            }
        });
        mButtonThree = (Button)v.findViewById(R.id.btn3);
        mButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mShineUsers.size()!= 0) {
                    String id = mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_ID);
                    ((HomeActivity) getActivity()).voteRequest(id, "3");
                    mShineUsers.remove(0);
                    if(mShineUsers.size()!=0)
                        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
                    else
                        emptyState();
                }
                else
                    Toast.makeText(getActivity(), "No user", Toast.LENGTH_SHORT).show();

            }
        });
        mButtonFour = (Button)v.findViewById(R.id.btn4);
        mButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mShineUsers.size()!= 0) {
                    String id = mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_ID);
                    ((HomeActivity) getActivity()).voteRequest(id, "4");
                    mShineUsers.remove(0);
                    if(mShineUsers.size()!=0)
                        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
                    else
                        emptyState();
                }
                else
                    Toast.makeText(getActivity(), "No user", Toast.LENGTH_SHORT).show();

            }
        });
        mButtonFive = (Button)v.findViewById(R.id.btn5);
        mButtonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mShineUsers.size() != 0) {
                    String id = mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_ID);
                    ((HomeActivity) getActivity()).voteRequest(id, "5");
                    mShineUsers.remove(0);
                    if (mShineUsers.size() != 0)
                        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
                    else
                        emptyState();
                } else
                    Toast.makeText(getActivity(), "No user", Toast.LENGTH_SHORT).show();
            }
        });
        mButtonSix = (Button)v.findViewById(R.id.btn6);
        mButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mShineUsers.size()!= 0) {
                    String id = mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_ID);
                    ((HomeActivity) getActivity()).voteRequest(id, "6");
                    mShineUsers.remove(0);
                    if(mShineUsers.size()!=0)
                        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
                    else
                        emptyState();
                }
                else
                    Toast.makeText(getActivity(), "No user", Toast.LENGTH_SHORT).show();

            }
        });
        mButtonSeven = (Button)v.findViewById(R.id.btn7);
        mButtonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mShineUsers.size()!= 0) {
                    String id = mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_ID);
                    ((HomeActivity) getActivity()).voteRequest(id, "7");
                    mShineUsers.remove(0);
                    if(mShineUsers.size()!=0)
                        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
                    else
                        emptyState();
                }
                else
                    Toast.makeText(getActivity(), "No user", Toast.LENGTH_SHORT).show();

            }
        });
        mButtonEight = (Button)v.findViewById(R.id.btn8);
        mButtonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mShineUsers.size()!= 0) {
                    String id = mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_ID);
                    ((HomeActivity) getActivity()).voteRequest(id, "8");
                    mShineUsers.remove(0);
                    if(mShineUsers.size()!=0)
                        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
                    else
                        emptyState();
                }
                else
                    Toast.makeText(getActivity(), "No user", Toast.LENGTH_SHORT).show();
            }
        });
        mButtonNine = (Button)v.findViewById(R.id.btn9);
        mButtonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mShineUsers.size()!= 0) {
                    String id = mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_ID);
                    ((HomeActivity) getActivity()).voteRequest(id, "9");
                    mShineUsers.remove(0);
                    if(mShineUsers.size()!=0)
                        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
                    else
                        emptyState();
                }
                else
                    Toast.makeText(getActivity(), "No user", Toast.LENGTH_SHORT).show();
            }
        });
        mButtonTen = (Button)v.findViewById(R.id.btn10);
        mButtonTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mShineUsers.size() != 0) {
                    String id = mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_ID);
                    ((HomeActivity) getActivity()).voteRequest(id, "10");
                    mShineUsers.remove(0);
                    if (mShineUsers.size() != 0)
                        bindUser(mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_NAME), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_GENDER), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_BITMAP), mShineUsers.get(0).getUser().get(ShineUser.MAP_USER_SCHOOL));
                    else
                        emptyState();
                } else
                    Toast.makeText(getActivity(), "No user", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void bindUser(String name, String gender, String photo, String school)
    {
            mImageViewGender.setImageResource(gender.equals("Male") ? R.drawable.gentleman : R.drawable.ladies);
            byte[] bytes = Base64.decode(photo, Base64.DEFAULT);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
            options.inSampleSize = ImageProcessingHelper.calculateInSampleSize(options,
                    width,
                    height);
            options.inJustDecodeBounds = false;
            Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
            if (bitmap == null) {
                mImageViewUserPhoto.setImageResource(R.drawable.com_facebook_profile_picture_blank_portrait);
            } else
                mImageViewUserPhoto.setImageBitmap(bitmap);

            mTextViewSchool.setText(school);
            mTextViewUsername.setText(name);
    }

    public void emptyState()
    {
        mTextViewSchool.setText("");
        mTextViewUsername.setText("");
        mImageViewUserPhoto.setImageResource(R.drawable.com_facebook_profile_picture_blank_portrait);
    }
    public static UserVoteFragment createFragment()
    {
        UserVoteFragment fragment = new UserVoteFragment();
        return fragment;
    }

}
