package com.xxh.recyclercommonadapter;


/**
 * Created by 解晓辉 on 16/6/22.
 作用：
 */
public interface ItemViewDelegate<T>
{

    int getItemViewLayoutId();

    boolean isForViewType(T item, int position);

    void convert(ViewHolder holder, T t, int position);

}
