package br.com.brunogea.roomwordsample.repositoty

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import br.com.brunogea.roomwordsample.dao.WordDao
import br.com.brunogea.roomwordsample.model.Word

class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}

