(ns marketentry.facts "Romania market-entry catalog.")
(def catalog
  {"ROU" {:name "Romania"
          :owner-authority "ANAP / SEAP (SICAP)"
          :legal-basis "Legea achizițiilor publice; EU directives"
          :national-spec "SEAP/SICAP supplier registration + CUI"
          :provenance "https://www.e-licitatie.ro/"
          :required-evidence ["CUI record" "SEAP registration record" "ONRC extract" "Authorized-representative record"]
          :rep-owner-authority "contracting authorities / ANAP"
          :rep-legal-basis "EU establishment or Romanian CUI entity for many procedures"
          :rep-provenance "https://www.e-licitatie.ro/"
          :corporate-number-owner-authority "ONRC / ANAF"
          :corporate-number-legal-basis "CUI / CIF"
          :corporate-number-provenance "https://www.onrc.ro/"}
   "USA" {:name "United States" :owner-authority "GSA/SAM.gov" :legal-basis "FAR" :national-spec "SAM.gov" :provenance "https://sam.gov/"
          :required-evidence ["EIN record" "SAM.gov registration record" "State business registration record" "SAM UEI verification record"]}
   "HUN" {:name "Hungary" :owner-authority "EKR" :legal-basis "Kbt." :national-spec "EKR" :provenance "https://ekr.gov.hu/"
          :required-evidence ["adószám record" "EKR registration" "cégkivonat" "Authorized-representative record"]}
   "BGR" {:name "Bulgaria" :owner-authority "AOP" :legal-basis "ZOP" :national-spec "CAIS" :provenance "https://www.aop.bg/"
          :required-evidence ["EIK record" "CAIS registration" "TR extract" "Authorized-representative record"]}})

(defn spec-basis [iso3] (get catalog iso3))
(defn coverage
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s) missing (remove catalog iso3s)]
     {:requested (count iso3s) :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note "R0 catalog seed"})))
(defn required-evidence-satisfied? [iso3 submitted]
  (when-let [{:keys [required-evidence]} (spec-basis iso3)]
    (= (count required-evidence) (count (filter (set submitted) required-evidence)))))
(defn evidence-checklist [iso3] (:required-evidence (spec-basis iso3) []))
(defn rep-spec-basis [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:rep-owner-authority sb)
      (select-keys sb [:rep-owner-authority :rep-legal-basis :rep-provenance]))))
(defn corporate-number-spec-basis [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:corporate-number-owner-authority sb)
      (select-keys sb [:corporate-number-owner-authority :corporate-number-legal-basis :corporate-number-provenance]))))
