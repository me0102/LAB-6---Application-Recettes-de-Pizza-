<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="8dp"
    android:background="#FFFFFF">

    <ImageView
        android:id="@+id/img_pizza_thumb"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:scaleType="centerCrop"
        android:layout_alignParentStart="true"
        android:layout_centerVertical="true" />

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_toEndOf="@id/img_pizza_thumb"
        android:layout_toStartOf="@+id/icon_arrow"
        android:layout_marginStart="16dp"
        android:layout_centerVertical="true"
        android:orientation="vertical">

        <TextView
            android:id="@+id/txt_pizza_title"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#333333"
            android:textSize="16sp"
            android:textAllCaps="true" />

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="12dp"
            android:orientation="horizontal">
            <TextView android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="👨‍🍳" android:textSize="18sp"/>
            <TextView
                android:id="@+id/txt_pizza_info_price"
                android:layout_width="wrap_content" android:layout_height="wrap_content"
                android:layout_marginStart="16dp" android:textColor="#777777" android:textSize="14sp" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:orientation="horizontal">
            <TextView android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="⏱️" android:textSize="18sp"/>
            <TextView
                android:id="@+id/txt_pizza_info_time"
                android:layout_width="wrap_content" android:layout_height="wrap_content"
                android:layout_marginStart="16dp" android:textColor="#777777" android:textSize="14sp" />
        </LinearLayout>
    </LinearLayout>

    <TextView
        android:id="@+id/icon_arrow"
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:layout_alignParentEnd="true" android:layout_centerVertical="true"
        android:layout_marginEnd="8dp" android:text="➔" android:textColor="#B0B0B0" android:textSize="24sp" />
</RelativeLayout>