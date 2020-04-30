CXXFLAGS_append_sh4 += " -std=c++11 -fPIC -fno-strict-aliasing "

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = "\
    file://fix-build-openssl102q.patch \
"

