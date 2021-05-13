package proj.ezcolet.contracts

import com.firebase.ui.firestore.FirestoreRecyclerOptions
import proj.ezcolet.models.order.OrderModel

interface CourierHomeContract {
    interface Presenter {
        suspend fun updateOrders(
            orderList: MutableList<OrderModel>,
            fromPosition: Int,
            toPosition: Int
        )

        suspend fun getOptions(username: String): FirestoreRecyclerOptions<OrderModel>
        fun getDate(): String
    }
}