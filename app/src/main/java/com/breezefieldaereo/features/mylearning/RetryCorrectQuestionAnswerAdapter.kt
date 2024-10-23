package com.breezefieldaereo.features.mylearning

// RetryCorrectQuestionAnswerAdapter.kt
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.breezefieldaereo.R



class RetryCorrectQuestionAnswerAdapter(
    private val questions: List<CorrectQuestionAnswer>,
    mContext: Context
) : RecyclerView.Adapter<RetryCorrectQuestionAnswerAdapter.QuestionViewHolder>() {

    inner class QuestionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val questionText: TextView = itemView.findViewById(R.id.question_text)
        private val option1: TextView = itemView.findViewById(R.id.option_1)
        private val option2: TextView = itemView.findViewById(R.id.option_2)
        private val option3: TextView = itemView.findViewById(R.id.option_3)
        private val option4: TextView = itemView.findViewById(R.id.option_4)
        private val ll_option1: LinearLayout = itemView.findViewById(R.id.ll_option1)
        private val ll_option2: LinearLayout = itemView.findViewById(R.id.ll_option2)
        private val ll_option3: LinearLayout = itemView.findViewById(R.id.ll_option3)
        private val ll_option4: LinearLayout = itemView.findViewById(R.id.ll_option4)
        private val separator_view: View = itemView.findViewById(R.id.separator_view)

        fun bind(question: CorrectQuestionAnswer) {
            questionText.text = "${position + 1}. ${question.question}" // Adding 1 to position for 1-based index
            option1.text = question.optionList.get(0).optionNo1
            option2.text = question.optionList.get(0).optionNo2
            option3.text = question.optionList.get(0).optionNo3
            option4.text = question.optionList.get(0).optionNo4

            // Highlight the answered option
            // Reset background colors
          /*  option1.setBackgroundColor(Color.parseColor("#DCF4EC"))
            option2.setBackgroundColor(Color.parseColor("#DCF4EC"))
            option3.setBackgroundColor(Color.parseColor("#DCF4EC"))
            option4.setBackgroundColor(Color.parseColor("#DCF4EC"))*/

            // Highlight the answered option
            when (question.answered) {
                "optionNo1" -> ll_option1.setBackgroundColor(Color.parseColor("#65FF6D"))
                "optionNo2" -> ll_option2.setBackgroundColor(Color.parseColor("#65FF6D"))
                "optionNo3" -> ll_option3.setBackgroundColor(Color.parseColor("#65FF6D"))
                "optionNo4" -> ll_option4.setBackgroundColor(Color.parseColor("#65FF6D"))
            }

            // Hide the separator view if this is the last item
            separator_view.visibility = if (position == itemCount - 1) View.GONE else View.VISIBLE

            // Set click listeners for each option
            val options = listOf(option1, option2, option3, option4)
            options.forEachIndexed { index, textView ->

            }
        }
    }

    private fun highlightAnsweredOption(answered: String) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_correct_question_answer, parent, false)
        return QuestionViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        holder.bind(questions[position])
    }

    override fun getItemCount(): Int = questions.size
}