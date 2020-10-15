package com.example.android.myfriendapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.my_friends_fragment.*

class MyFriendsFragment : Fragment() {

    private var listTeman: List<MyFriend>? = null
    private var db: AppDatabase? = null
    private var myFriendDao: MyFriendDao? = null

    companion object {
        fun newInstance(): MyFriendsFragment {
            return MyFriendsFragment()
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.my_friends_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        initLocalDB()
        initView()
    }

    private fun initLocalDB() {
        db = AppDatabase.getAppDataBase(activity!!)
        myFriendDao = db?.myFriendDao()
    }

    private fun initView() {
        fabAddFriend.setOnClickListener {
            (activity as MainActivity).tampilMyFriendsAddFragment()
        }
        fabAddFriend.setOnClickListener {
            (activity as MainActivity).tampilMyFriendsAddFragment()
        }

        ambilDataTeman()
    }

    private fun ambilDataTeman() {

        listTeman = ArrayList()
        myFriendDao?.ambilSemuaTeman()?.observe(this, Observer { r ->
            listTeman = r as MutableList<MyFriend>?

            when {
                listTeman?.size == 0 -> tampilToast("Belum ada data teman")

                else -> {
                    tampilTeman()
                }
            }
        })
    }

    private fun tampilToast(message: String) {
        Toast.makeText(activity!!, message, Toast.LENGTH_SHORT).show()
    }

    private fun tampilTeman() {
        listMyFriend.layoutManager = LinearLayoutManager(activity)
        listMyFriend.adapter = MyFriendAdapter(activity!!, (listTeman as ArrayList<MyFriend>?)!!)
    }


    // private fun simulasiDataTeman(){
    //   listTeman = ArrayList()

    // listTeman.add(MyFriend("Muhammad","Laki-Laki","ade@gmail.com","085719004268","Bandung"))
    // listTeman.add(MyFriend("Al Harits", "Laki-laki", "rifaldi@gmail.com", "081213416171", "Bandung"))
    //}


    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}





