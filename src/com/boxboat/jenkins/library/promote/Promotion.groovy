package com.boxboat.jenkins.library.promote

import com.boxboat.jenkins.library.config.BaseConfig

class Promotion extends BaseConfig<Promotion> implements Serializable {

    String event

    String promoteToEvent

}
