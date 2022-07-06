package edu.miu.cs.cs425.mystudentmgmtapp.service.impl;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.TranscriptRepository;
import edu.miu.cs.cs425.mystudentmgmtapp.service.TranscriptService;

public class TranscriptServiceImpl implements TranscriptService {

    private TranscriptRepository transcriptRepository;
    @Override
    public Transcript addNewTranscript(Transcript transcript) {
        return transcriptRepository.save(transcript);
    }
}
