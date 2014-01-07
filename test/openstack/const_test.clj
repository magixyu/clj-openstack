(ns openstack.const-test
  (:require [clojure.test :refer :all]
            [openstack.const :as const]))


(deftest test-auth-url
  (is (= "https://identity.api.rackspacecloud.com/v2.0/tokens"
         const/auth-url)))

(def test-x-auth-user
  (is (= "X-Auth-User"
         const/x-auth-user)))

(def test-x-server-management-url
  (is (= "X-Server-Management-Url"
        const/x-server-management-url)))

(def test-x-auth-key
  (is (= "X-Auth-Key"
        const/x-auth-key)))

(def test-x-storage-url
  (is (= "X-Storage-Url"
        const/x-storage-url)))

(def test-x-auth-token
  (is (= "X-Auth-Token"
        const/x-auth-token)))

(deftest test-openstack-dir
  (is (= (str (System/getProperty "user.home") "/.openstack")
         const/os-dir)))

(deftest test-username-file
  (is (= (str (System/getProperty "user.home") "/.openstack/username")
         const/username-file)))

(deftest test-password-file
  (is (= (str (System/getProperty "user.home") "/.openstack/password")
         const/password-file)))

(deftest test-apikey-file
  (is (= (str (System/getProperty "user.home") "/.openstack/apikey")
         const/apikey-file)))

(deftest test-username-env
  (is (= "OS_USERNAME"
         const/username-env)))

(deftest test-password-env
  (is (= "OS_PASSWORD"
        const/password-env)))

(deftest tenant-name-env
  (is (= "OS_TENANT_NAME"
        const/tenant-name-env)))

(deftest tenant-id-env
  (is (= "OS_TENANT_ID"
        const/tenant-id-env)))

(deftest region-name-env
  (is (= "OS_REGION_NAME"
        const/region-name-env)))

(deftest token-env
  (is (= "OS_TOKEN"
        const/token-env)))

(deftest auth-url-env
  (is (= "OS_AUTH_URL"
        const/auth-url-env)))

(deftest test-server-path
  (is (= "/servers"
         const/server-path)))

(deftest test-server-detail-path
  (is (= "/servers/detail"
         const/server-detail-path)))
