package mmandroid.mataharimall.com.presentation

/**
 * Created by adrie_savana on 12/28/17.
 */
interface BaseView<in T : BasePresenter> {

    fun setPresenter(presenter: T)

}