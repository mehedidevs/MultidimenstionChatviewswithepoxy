package com.mehedi.multidimenstionchatviewswithepoxy.uimodel

import android.view.View
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.mehedi.multidimenstionchatviewswithepoxy.R
import com.mehedi.multidimenstionchatviewswithepoxy.databinding.ViewHolderHeaderItemBinding

@EpoxyModelClass
abstract class HeaderItemModel(var title: String) : EpoxyModelWithHolder<HeaderItemModel.Holder>() {

    override fun getDefaultLayout() = R.layout.view_holder_header_item


    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.binding.headerTitle.text = title

    }


    class Holder : EpoxyHolder() {
        lateinit var binding: ViewHolderHeaderItemBinding
        override fun bindView(itemView: View) {
            binding = ViewHolderHeaderItemBinding.bind(itemView)

        }

    }


}