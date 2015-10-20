; here it goes!! :-)o

;print events to the log
(streams prn
  #(info %))

; emails francisco for any critical event on http production services
; (let [email (mailer {:from "francisco.cabrita@gmail.com"})]
; (streams
;     (where (and (tagged "prod")
;                 (service #"http")
;                 (state "critical"))
;     (email "francisco.cabrita@gmail.com"))))
